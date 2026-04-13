package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.792f, 11.265f)
            curveToRelative(0.285f, -0.3f, 0.272f, -0.775f, -0.03f, -1.06f)
            curveToRelative(-0.3f, -0.284f, -0.775f, -0.271f, -1.06f, 0.03f)
            lineToRelative(-4.955f, 5.239f)
            verticalLineTo(2.75f)
            curveToRelative(0f, -0.414f, -0.335f, -0.75f, -0.75f, -0.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(12.726f)
            lineTo(4.29f, 10.235f)
            curveToRelative(-0.285f, -0.301f, -0.76f, -0.314f, -1.06f, -0.03f)
            curveToRelative(-0.301f, 0.285f, -0.314f, 0.76f, -0.03f, 1.06f)
            lineToRelative(6.07f, 6.418f)
            curveToRelative(0.157f, 0.166f, 0.357f, 0.266f, 0.566f, 0.3f)
            curveTo(9.888f, 17.994f, 9.942f, 18f, 9.997f, 18f)
            curveToRelative(0.058f, 0f, 0.114f, -0.006f, 0.168f, -0.019f)
            curveToRelative(0.206f, -0.035f, 0.403f, -0.134f, 0.558f, -0.298f)
            lineToRelative(6.07f, -6.418f)
            close()
        }
    }.build()
}
