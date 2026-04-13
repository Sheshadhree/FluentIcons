package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhoneCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(9f, 7.985f, 9f, 5.5f)
            reflectiveCurveTo(11.015f, 1f, 13.5f, 1f)
            reflectiveCurveTo(18f, 3.015f, 18f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(12.5f, 6.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(9.257f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 2f, 5f, 2.672f, 5f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(5f, 17.328f, 5.672f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-5.707f)
            curveToRelative(-0.322f, 0.091f, -0.657f, 0.154f, -1f, 0.185f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 17f, 6f, 16.776f, 6f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(2.1f)
            curveToRelative(0.183f, -0.358f, 0.404f, -0.693f, 0.657f, -1f)
            close()
            moveTo(8f, 14.5f)
            curveTo(8f, 14.224f, 8.224f, 14f, 8.5f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 15f, 11.5f, 15f)
            horizontalLineToRelative(-3f)
            curveTo(8.224f, 15f, 8f, 14.776f, 8f, 14.5f)
            close()
        }
    }.build()
}
