package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShift16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShift16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.184f, 1.571f)
            curveTo(8.58f, 0.81f, 7.42f, 0.81f, 6.817f, 1.571f)
            lineTo(2.218f, 7.373f)
            curveToRelative(-0.52f, 0.657f, -0.05f, 1.621f, 0.789f, 1.621f)
            horizontalLineToRelative(1.978f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.552f, 0.45f, 1f, 1.005f, 1f)
            horizontalLineToRelative(4.02f)
            curveToRelative(0.556f, 0f, 1.005f, -0.448f, 1.005f, -1.001f)
            verticalLineTo(8.994f)
            horizontalLineToRelative(1.978f)
            curveToRelative(0.84f, 0f, 1.31f, -0.964f, 0.789f, -1.62f)
            lineTo(9.184f, 1.57f)
            close()
        }
    }.build()
}
