package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoPerson20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoPerson20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(11.38f, 6f, 10f, 6f)
            reflectiveCurveTo(7.5f, 7.12f, 7.5f, 8.5f)
            reflectiveCurveTo(8.62f, 11f, 10f, 11f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            reflectiveCurveTo(9.172f, 7f, 10f, 7f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(10.828f, 10f, 10f, 10f)
            close()
            moveTo(2f, 5.5f)
            curveTo(2f, 4.672f, 2.672f, 4f, 3.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(17.328f, 4f, 18f, 4.672f, 18f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-13f)
            curveTo(2.672f, 16f, 2f, 15.328f, 2f, 14.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(7f, 15f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 13f, 7f, 13.224f, 7f, 13.5f)
            verticalLineTo(15f)
            close()
            moveToRelative(7f, 0f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 5.224f, 16.776f, 5f, 16.5f, 5f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 5f, 3f, 5.224f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 14.776f, 3.224f, 15f, 3.5f, 15f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1.5f)
            curveTo(6f, 12.672f, 6.672f, 12f, 7.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineTo(15f)
            close()
        }
    }.build()
}
