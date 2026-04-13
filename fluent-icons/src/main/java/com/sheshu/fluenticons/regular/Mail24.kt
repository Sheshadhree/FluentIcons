package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mail24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mail24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 4f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.733f, 0f, 3.15f, 1.356f, 3.245f, 3.066f)
            lineTo(22f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(18.75f, 20f)
            horizontalLineTo(5.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(2f, 16.75f)
            verticalLineToRelative(-9.5f)
            curveTo(2f, 5.517f, 3.357f, 4.1f, 5.066f, 4.005f)
            lineTo(5.25f, 4f)
            horizontalLineToRelative(13.5f)
            horizontalLineToRelative(-13.5f)
            close()
            moveTo(20.5f, 9.373f)
            lineToRelative(-8.15f, 4.29f)
            curveToRelative(-0.188f, 0.1f, -0.407f, 0.113f, -0.603f, 0.043f)
            lineToRelative(-0.096f, -0.042f)
            lineTo(3.5f, 9.374f)
            verticalLineToRelative(7.376f)
            curveToRelative(0f, 0.918f, 0.707f, 1.671f, 1.606f, 1.744f)
            lineTo(5.25f, 18.5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.918f, 0f, 1.671f, -0.707f, 1.744f, -1.607f)
            lineTo(20.5f, 16.75f)
            verticalLineTo(9.373f)
            close()
            moveTo(18.75f, 5.5f)
            horizontalLineTo(5.25f)
            curveToRelative(-0.918f, 0f, -1.671f, 0.707f, -1.744f, 1.606f)
            lineTo(3.5f, 7.25f)
            verticalLineToRelative(0.429f)
            lineToRelative(8.5f, 4.473f)
            lineToRelative(8.5f, -4.474f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -0.918f, -0.707f, -1.671f, -1.607f, -1.744f)
            lineTo(18.75f, 5.5f)
            close()
        }
    }.build()
}
