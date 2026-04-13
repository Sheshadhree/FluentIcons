package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Class20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Class20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.19f, -0.107f, 0.363f, -0.276f, 0.447f)
            curveTo(10.554f, 9.032f, 10.35f, 9.014f, 10.2f, 8.9f)
            lineTo(8.5f, 7.625f)
            lineTo(6.8f, 8.9f)
            curveTo(6.649f, 9.014f, 6.446f, 9.032f, 6.276f, 8.947f)
            curveTo(6.107f, 8.863f, 6f, 8.69f, 6f, 8.5f)
            verticalLineTo(2f)
            close()
            moveToRelative(4f, 0f)
            horizontalLineTo(7f)
            verticalLineToRelative(5.5f)
            lineToRelative(1.2f, -0.9f)
            curveToRelative(0.178f, -0.133f, 0.422f, -0.133f, 0.6f, 0f)
            lineTo(10f, 7.5f)
            verticalLineTo(2f)
            close()
        }
    }.build()
}
