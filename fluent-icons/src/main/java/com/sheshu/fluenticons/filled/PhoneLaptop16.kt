package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneLaptop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneLaptop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(8f)
            curveTo(13.328f, 2.5f, 14f, 3.172f, 14f, 4f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            curveTo(8.5f, 5.12f, 7.38f, 4f, 6f, 4f)
            horizontalLineTo(3.5f)
            curveTo(3.327f, 4f, 3.16f, 4.022f, 3f, 4.063f)
            verticalLineTo(4f)
            close()
            moveToRelative(11.5f, 8.5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            close()
            moveTo(3f, 5f)
            curveTo(2.172f, 5f, 1.5f, 5.672f, 1.5f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(1.5f, 13.328f, 2.172f, 14f, 3f, 14f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveTo(7.5f, 5.672f, 6.828f, 5f, 6f, 5f)
            horizontalLineTo(3f)
            close()
            moveToRelative(1.5f, 7.5f)
            curveTo(4.224f, 12.5f, 4f, 12.276f, 4f, 12f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(5f, 11.724f, 5f, 12f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
