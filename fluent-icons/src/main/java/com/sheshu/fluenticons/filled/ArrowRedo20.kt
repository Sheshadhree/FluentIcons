package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRedo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRedo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.14f, 6.5f)
            horizontalLineToRelative(-2.387f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(10.34f, 8f, 10.753f, 8f)
            horizontalLineToRelative(4.4f)
            curveToRelative(0.47f, 0f, 0.85f, -0.38f, 0.85f, -0.85f)
            verticalLineToRelative(-4.4f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(2.947f)
            lineToRelative(-3.059f, -2.66f)
            curveToRelative(-2.188f, -1.9f, -5.504f, -1.669f, -7.406f, 0.52f)
            curveToRelative(-1.902f, 2.188f, -1.67f, 5.504f, 0.518f, 7.406f)
            lineToRelative(8.172f, 7.104f)
            curveToRelative(0.312f, 0.272f, 0.786f, 0.239f, 1.058f, -0.074f)
            curveToRelative(0.271f, -0.313f, 0.238f, -0.786f, -0.074f, -1.058f)
            lineTo(5.54f, 9.83f)
            curveTo(3.977f, 8.472f, 3.81f, 6.103f, 5.17f, 4.54f)
            curveToRelative(1.359f, -1.563f, 3.727f, -1.729f, 5.29f, -0.37f)
            lineToRelative(2.68f, 2.33f)
            close()
        }
    }.build()
}
