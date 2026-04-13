package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOneQuarter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOneQuarter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.52f)
            lineTo(5.673f, 5.184f)
            lineTo(2.272f, 5.678f)
            curveTo(1.792f, 5.748f, 1.499f, 6.156f, 1.5f, 6.576f)
            curveToRelative(0f, 0.226f, 0.086f, 0.455f, 0.273f, 0.637f)
            lineToRelative(2.46f, 2.399f)
            lineToRelative(-0.58f, 3.387f)
            curveToRelative(-0.042f, 0.247f, 0.016f, 0.474f, 0.138f, 0.654f)
            curveToRelative(0.241f, 0.356f, 0.73f, 0.526f, 1.168f, 0.295f)
            lineTo(6f, 13.401f)
            verticalLineTo(4.52f)
            close()
        }
    }.build()
}
