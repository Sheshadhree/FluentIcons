package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.295f, 19.715f)
            curveToRelative(0.393f, 0.388f, 1.027f, 0.383f, 1.414f, -0.01f)
            curveToRelative(0.388f, -0.394f, 0.383f, -1.027f, -0.01f, -1.414f)
            lineToRelative(-5.37f, -5.292f)
            horizontalLineToRelative(13.67f)
            curveToRelative(0.553f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.447f, -1f, -1f, -1f)
            horizontalLineTo(6.336f)
            lineTo(11.7f, 5.714f)
            curveToRelative(0.393f, -0.387f, 0.398f, -1.02f, 0.01f, -1.414f)
            curveToRelative(-0.387f, -0.393f, -1.02f, -0.398f, -1.414f, -0.01f)
            lineTo(3.37f, 11.112f)
            curveToRelative(-0.497f, 0.49f, -0.497f, 1.291f, 0f, 1.78f)
            lineToRelative(6.924f, 6.823f)
            close()
        }
    }.build()
}
