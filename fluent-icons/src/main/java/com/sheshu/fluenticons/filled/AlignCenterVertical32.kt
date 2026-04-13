package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterVertical32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterVertical32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 30f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-3.5f)
            curveTo(9.567f, 27f, 8f, 25.433f, 8f, 23.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineTo(15f)
            verticalLineToRelative(-2f)
            horizontalLineTo(8.5f)
            curveTo(6.567f, 15f, 5f, 13.433f, 5f, 11.5f)
            verticalLineToRelative(-3f)
            curveTo(5f, 6.567f, 6.567f, 5f, 8.5f, 5f)
            horizontalLineTo(15f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(6.5f)
            curveTo(25.433f, 5f, 27f, 6.567f, 27f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
