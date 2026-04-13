package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpload32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpload32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2f)
            curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(18f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(9.707f, 4.293f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-7f, 7f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineTo(15f, 9.414f)
            verticalLineTo(29f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9.414f)
            lineToRelative(5.293f, 5.293f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-7f, -7f)
            close()
        }
    }.build()
}
