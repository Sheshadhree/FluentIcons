package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TeardropBottomRight32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TeardropBottomRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            verticalLineToRelative(10.75f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(16f)
            curveTo(8.268f, 30f, 2f, 23.732f, 2f, 16f)
            close()
            moveTo(16f, 4f)
            curveTo(9.373f, 4f, 4f, 9.373f, 4f, 16f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            horizontalLineToRelative(10.75f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(16f)
            curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
            close()
        }
    }.build()
}
