package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.CodeBlock48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.CodeBlock48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0281195f to Color(0xFFE67EEA),
                    0.43755f to Color(0xFFAD64D7),
                    1f to Color(0xFF794DC5)
                ),
                start = Offset(14.7776f, 6f),
                end = Offset(34.5203f, 42f)
            )
        ) {
            moveTo(12f, 6f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            verticalLineToRelative(24f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            horizontalLineToRelative(24f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(12f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            horizontalLineTo(12f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(17.1646f, 15.6924f),
                end = Offset(28.0337f, 42.7855f)
            )
        ) {
            moveTo(20.884f, 15.366f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineTo(14.018f, 24f)
            lineToRelative(6.866f, 6.866f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-7.75f, -7.75f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(7.75f, -7.75f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            close()
            moveToRelative(8f, 0f)
            lineToRelative(7.75f, 7.75f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-7.75f, 7.75f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, -1.28f, 0f, -1.768f)
            lineTo(33.982f, 24f)
            lineToRelative(-6.866f, -6.866f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            close()
        }
    }.build()
}
