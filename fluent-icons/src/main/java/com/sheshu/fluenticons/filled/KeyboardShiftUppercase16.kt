package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShiftUppercase16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShiftUppercase16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.817f, 1.571f)
            curveToRelative(0.604f, -0.761f, 1.763f, -0.761f, 2.367f, 0f)
            lineToRelative(4.598f, 5.802f)
            curveToRelative(0.52f, 0.657f, 0.05f, 1.621f, -0.789f, 1.621f)
            horizontalLineToRelative(-1.978f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.553f, -0.45f, 1.001f, -1.005f, 1.001f)
            horizontalLineTo(5.99f)
            curveToRelative(-0.555f, 0f, -1.005f, -0.448f, -1.005f, -1.001f)
            verticalLineTo(8.994f)
            horizontalLineTo(3.007f)
            curveToRelative(-0.84f, 0f, -1.31f, -0.964f, -0.789f, -1.62f)
            lineToRelative(4.6f, -5.803f)
            close()
            moveTo(5.5f, 13f)
            curveTo(5.224f, 13f, 5f, 13.224f, 5f, 13.5f)
            reflectiveCurveTo(5.224f, 14f, 5.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.776f, 13f, 10.5f, 13f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
