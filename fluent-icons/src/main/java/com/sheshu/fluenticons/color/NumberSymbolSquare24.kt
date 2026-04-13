package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.NumberSymbolSquare24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.NumberSymbolSquare24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.0281195f to Color(0xFFE67EEA),
                    0.43755f to Color(0xFFAD64D7),
                    1f to Color(0xFF794DC5)
                ),
                start = Offset(7.38879f, 3f),
                end = Offset(17.2602f, 21f)
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFF9DCFA)
                ),
                start = Offset(9.37099f, 7.84623f),
                end = Offset(15.8197f, 20.2105f)
            )
        ) {
            moveTo(10.898f, 7.515f)
            curveToRelative(0.406f, 0.081f, 0.67f, 0.476f, 0.588f, 0.882f)
            lineTo(11.266f, 9.5f)
            horizontalLineToRelative(2.47f)
            lineToRelative(0.28f, -1.397f)
            curveToRelative(0.08f, -0.406f, 0.476f, -0.67f, 0.882f, -0.588f)
            curveToRelative(0.406f, 0.081f, 0.67f, 0.476f, 0.588f, 0.882f)
            lineTo(15.266f, 9.5f)
            horizontalLineToRelative(0.984f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(16.664f, 11f, 16.25f, 11f)
            horizontalLineToRelative(-1.285f)
            lineToRelative(-0.4f, 2f)
            horizontalLineToRelative(1.185f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-1.485f)
            lineToRelative(-0.28f, 1.398f)
            curveToRelative(-0.08f, 0.406f, -0.476f, 0.669f, -0.882f, 0.588f)
            curveToRelative(-0.406f, -0.082f, -0.67f, -0.477f, -0.588f, -0.883f)
            lineToRelative(0.22f, -1.103f)
            horizontalLineToRelative(-2.47f)
            lineToRelative(-0.28f, 1.398f)
            curveToRelative(-0.08f, 0.406f, -0.476f, 0.669f, -0.882f, 0.588f)
            curveToRelative(-0.406f, -0.082f, -0.67f, -0.477f, -0.588f, -0.883f)
            lineToRelative(0.22f, -1.103f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 14.5f, 7f, 14.164f, 7f, 13.75f)
            reflectiveCurveTo(7.336f, 13f, 7.75f, 13f)
            horizontalLineToRelative(1.286f)
            lineToRelative(0.4f, -2f)
            horizontalLineTo(8.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(7.836f, 9.5f, 8.25f, 9.5f)
            horizontalLineToRelative(1.486f)
            lineToRelative(0.28f, -1.397f)
            curveToRelative(0.08f, -0.406f, 0.476f, -0.67f, 0.882f, -0.588f)
            close()
            moveTo(10.565f, 13f)
            horizontalLineToRelative(2.47f)
            lineToRelative(0.4f, -2f)
            horizontalLineToRelative(-2.47f)
            lineToRelative(-0.4f, 2f)
            close()
        }
    }.build()
}
