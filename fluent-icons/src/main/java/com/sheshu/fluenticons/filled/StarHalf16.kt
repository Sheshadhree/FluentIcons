package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarHalf16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarHalf16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1.6f)
            curveToRelative(-0.32f, 0f, -0.641f, 0.167f, -0.806f, 0.5f)
            lineTo(5.673f, 5.183f)
            lineTo(2.272f, 5.678f)
            curveToRelative(-0.739f, 0.107f, -1.033f, 1.014f, -0.5f, 1.535f)
            lineToRelative(2.462f, 2.399f)
            lineToRelative(-0.581f, 3.387f)
            curveToRelative(-0.126f, 0.736f, 0.645f, 1.296f, 1.306f, 0.949f)
            lineTo(8f, 12.349f)
            verticalLineTo(1.6f)
            close()
        }
    }.build()
}
