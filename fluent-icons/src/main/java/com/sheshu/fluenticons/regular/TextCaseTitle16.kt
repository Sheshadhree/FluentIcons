package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextCaseTitle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextCaseTitle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 2.5f)
            curveToRelative(0.21f, 0f, 0.397f, 0.13f, 0.47f, 0.327f)
            lineToRelative(3.5f, 9.5f)
            curveToRelative(0.095f, 0.26f, -0.038f, 0.547f, -0.297f, 0.642f)
            curveToRelative(-0.26f, 0.096f, -0.547f, -0.037f, -0.642f, -0.296f)
            lineTo(7.046f, 10f)
            horizontalLineTo(2.954f)
            lineToRelative(-0.985f, 2.673f)
            curveToRelative(-0.095f, 0.259f, -0.383f, 0.392f, -0.642f, 0.296f)
            curveToRelative(-0.259f, -0.095f, -0.391f, -0.383f, -0.296f, -0.642f)
            lineToRelative(3.5f, -9.5f)
            curveTo(4.603f, 2.631f, 4.791f, 2.5f, 5.001f, 2.5f)
            close()
            moveToRelative(0f, 1.946f)
            lineTo(3.322f, 9f)
            horizontalLineToRelative(3.356f)
            lineTo(5f, 4.446f)
            close()
            moveTo(10.5f, 2.5f)
            curveTo(10.776f, 2.5f, 11f, 2.724f, 11f, 3f)
            verticalLineToRelative(4.6f)
            curveTo(11.418f, 7.223f, 11.937f, 7f, 12.5f, 7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.343f, 2.5f, 3f)
            reflectiveCurveToRelative(-1.12f, 3f, -2.5f, 3f)
            curveToRelative(-0.563f, 0f, -1.082f, -0.223f, -1.5f, -0.6f)
            verticalLineToRelative(0.1f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 12.776f, 10f, 12.5f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveToRelative(2f, 9.5f)
            curveToRelative(0.665f, 0f, 1.5f, -0.717f, 1.5f, -2f)
            reflectiveCurveToRelative(-0.835f, -2f, -1.5f, -2f)
            reflectiveCurveTo(11f, 8.717f, 11f, 10f)
            reflectiveCurveToRelative(0.835f, 2f, 1.5f, 2f)
            close()
        }
    }.build()
}
