package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Megaphone12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Megaphone12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.963f, 1.104f)
            curveTo(9.945f, 0.727f, 11f, 1.452f, 11f, 2.504f)
            verticalLineToRelative(5.997f)
            curveToRelative(0f, 1.016f, -0.988f, 1.738f, -1.956f, 1.43f)
            lineTo(6.982f, 9.273f)
            curveTo(6.848f, 10.248f, 6.012f, 11f, 5f, 11f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(8.003f)
            lineTo(2.044f, 7.698f)
            curveTo(1.422f, 7.5f, 1f, 6.922f, 1f, 6.27f)
            verticalLineTo(5.188f)
            curveToRelative(0f, -0.622f, 0.383f, -1.179f, 0.963f, -1.401f)
            lineToRelative(7f, -2.683f)
            close()
            moveTo(4f, 8.322f)
            verticalLineTo(9f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(8.96f)
            lineTo(4f, 8.322f)
            close()
        }
    }.build()
}
