package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleLine12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleLine12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            horizontalLineTo(1f)
            close()
            moveToRelative(0.1f, 1f)
            curveToRelative(0.463f, 2.282f, 2.481f, 4f, 4.9f, 4f)
            curveToRelative(2.419f, 0f, 4.437f, -1.718f, 4.9f, -4f)
            horizontalLineTo(1.1f)
            close()
        }
    }.build()
}
