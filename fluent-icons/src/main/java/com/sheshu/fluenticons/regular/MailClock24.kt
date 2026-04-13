package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailClock24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailClock24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            reflectiveCurveTo(12f, 3.462f, 12f, 6.5f)
            reflectiveCurveToRelative(2.462f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveTo(23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(17.5f, 3f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(20.276f, 7f, 20f, 7f)
            horizontalLineToRelative(-2.5f)
            curveTo(17.224f, 7f, 17f, 6.776f, 17f, 6.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 3.224f, 17.224f, 3f, 17.5f, 3f)
            close()
            moveToRelative(3f, 9.268f)
            verticalLineToRelative(4.482f)
            lineToRelative(-0.006f, 0.143f)
            curveToRelative(-0.073f, 0.9f, -0.826f, 1.607f, -1.744f, 1.607f)
            horizontalLineTo(5.25f)
            lineToRelative(-0.144f, -0.006f)
            curveTo(4.207f, 18.421f, 3.5f, 17.668f, 3.5f, 16.75f)
            verticalLineTo(9.374f)
            lineToRelative(8.15f, 4.29f)
            lineToRelative(0.097f, 0.042f)
            curveToRelative(0.196f, 0.07f, 0.415f, 0.056f, 0.602f, -0.042f)
            lineToRelative(2.41f, -1.269f)
            curveToRelative(-0.527f, -0.245f, -1.015f, -0.559f, -1.454f, -0.93f)
            lineTo(12f, 12.153f)
            lineTo(3.5f, 7.678f)
            verticalLineTo(7.25f)
            lineToRelative(0.006f, -0.144f)
            curveTo(3.579f, 6.207f, 4.332f, 5.5f, 5.25f, 5.5f)
            horizontalLineToRelative(5.826f)
            curveTo(11.157f, 4.977f, 11.3f, 4.474f, 11.498f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.066f, 4.005f)
            curveTo(3.356f, 4.101f, 2f, 5.517f, 2f, 7.25f)
            verticalLineToRelative(9.5f)
            lineToRelative(0.005f, 0.184f)
            curveTo(2.101f, 18.644f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineToRelative(13.5f)
            lineToRelative(0.184f, -0.005f)
            curveTo(20.644f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineToRelative(-5.56f)
            curveToRelative(-0.444f, 0.427f, -0.949f, 0.79f, -1.5f, 1.078f)
            close()
        }
    }.build()
}
