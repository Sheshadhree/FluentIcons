package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUndo20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUndo20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.862f, 6.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 6.5f, 10f, 6.836f, 10f, 7.25f)
            reflectiveCurveTo(9.664f, 8f, 9.25f, 8f)
            horizontalLineToRelative(-4.4f)
            curveTo(4.38f, 8f, 4f, 7.62f, 4f, 7.15f)
            verticalLineToRelative(-4.4f)
            curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
            reflectiveCurveTo(5.5f, 2.336f, 5.5f, 2.75f)
            verticalLineToRelative(2.947f)
            lineToRelative(3.059f, -2.66f)
            curveToRelative(2.188f, -1.901f, 5.504f, -1.67f, 7.406f, 0.519f)
            curveToRelative(1.902f, 2.188f, 1.67f, 5.504f, -0.518f, 7.406f)
            lineToRelative(-8.171f, 7.104f)
            curveToRelative(-0.313f, 0.272f, -0.787f, 0.239f, -1.059f, -0.074f)
            curveToRelative(-0.271f, -0.313f, -0.238f, -0.786f, 0.074f, -1.058f)
            lineToRelative(8.172f, -7.104f)
            curveToRelative(1.563f, -1.358f, 1.729f, -3.727f, 0.37f, -5.29f)
            curveToRelative(-1.358f, -1.563f, -3.727f, -1.729f, -5.29f, -0.37f)
            lineTo(6.863f, 6.5f)
            close()
        }
    }.build()
}
