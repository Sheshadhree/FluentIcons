package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBounce28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBounce28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(8f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(5.489f)
            lineToRelative(9.514f, 9.118f)
            lineToRelative(9.308f, -8.843f)
            curveToRelative(0.4f, -0.38f, 1.034f, -0.364f, 1.414f, 0.036f)
            curveToRelative(0.38f, 0.4f, 0.364f, 1.034f, -0.036f, 1.414f)
            lineToRelative(-10f, 9.5f)
            curveToRelative(-0.387f, 0.368f, -0.995f, 0.366f, -1.38f, -0.003f)
            lineTo(4f, 10.343f)
            verticalLineTo(16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
