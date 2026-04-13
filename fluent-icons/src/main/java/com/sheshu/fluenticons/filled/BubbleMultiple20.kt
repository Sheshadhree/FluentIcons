package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BubbleMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BubbleMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 4.5f)
            curveTo(19f, 6.433f, 17.433f, 8f, 15.5f, 8f)
            reflectiveCurveTo(12f, 6.433f, 12f, 4.5f)
            reflectiveCurveTo(13.567f, 1f, 15.5f, 1f)
            reflectiveCurveTo(19f, 2.567f, 19f, 4.5f)
            close()
            moveTo(9.172f, 15.595f)
            curveTo(9.632f, 16.992f, 10.947f, 18f, 12.497f, 18f)
            curveToRelative(1.934f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -1.793f, -1.347f, -3.271f, -3.085f, -3.476f)
            curveToRelative(-0.36f, 2.095f, -1.808f, 3.819f, -3.74f, 4.57f)
            close()
            moveTo(12f, 10f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
            moveTo(7.029f, 7.505f)
            curveToRelative(-0.092f, 0.26f, 0.044f, 0.546f, 0.304f, 0.638f)
            curveToRelative(0.71f, 0.251f, 1.274f, 0.814f, 1.525f, 1.524f)
            curveToRelative(0.092f, 0.26f, 0.377f, 0.397f, 0.638f, 0.305f)
            curveToRelative(0.26f, -0.093f, 0.396f, -0.378f, 0.304f, -0.639f)
            curveTo(9.448f, 8.34f, 8.661f, 7.552f, 7.667f, 7.2f)
            curveTo(7.407f, 7.108f, 7.12f, 7.245f, 7.029f, 7.505f)
            close()
        }
    }.build()
}
