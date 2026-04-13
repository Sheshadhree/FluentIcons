package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CodeBlock28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CodeBlock28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0281195f to Color(0xFFE67EEA),
                    0.43755f to Color(0xFFAD64D7),
                    1f to Color(0xFF794DC5)
                ),
                start = Offset(8.36408f, 3f),
                end = Offset(20.4291f, 25f)
            )
        ) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(14.5f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(10.0565f, 9.38467f),
                end = Offset(15.9305f, 24.5896f)
            )
        ) {
            moveTo(12.03f, 9.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-4.25f, 4.25f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4.25f, 4.25f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(8.31f, 14f)
            lineToRelative(3.72f, -3.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(19.69f, 14f)
            lineToRelative(-3.72f, 3.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(4.25f, -4.25f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.25f, -4.25f)
            close()
        }
    }.build()
}
