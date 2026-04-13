package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShoppingBag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6.5f)
            curveTo(9f, 4.015f, 11.015f, 2f, 13.5f, 2f)
            curveToRelative(0.925f, 0f, 1.784f, 0.279f, 2.5f, 0.757f)
            curveTo(16.713f, 2.28f, 17.573f, 2f, 18.497f, 2f)
            curveToRelative(2.486f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineTo(10f)
            horizontalLineTo(25f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(20f, 28.433f, 20f, 26.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(0.998f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -1.38f, -1.119f, -2.5f, -2.5f, -2.5f)
            curveToRelative(-0.394f, 0f, -0.766f, 0.091f, -1.098f, 0.254f)
            curveTo(17.782f, 4.914f, 18f, 5.682f, 18f, 6.5f)
            verticalLineToRelative(20f)
            curveToRelative(0f, 1.33f, 0.472f, 2.55f, 1.257f, 3.5f)
            horizontalLineTo(9.5f)
            curveTo(7.015f, 30f, 5f, 27.985f, 5f, 25.5f)
            verticalLineTo(12f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineTo(6.5f)
            close()
            moveToRelative(2f, 3.5f)
            horizontalLineToRelative(5f)
            verticalLineTo(6.5f)
            curveTo(16f, 5.12f, 14.88f, 4f, 13.5f, 4f)
            reflectiveCurveTo(11f, 5.12f, 11f, 6.5f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}
