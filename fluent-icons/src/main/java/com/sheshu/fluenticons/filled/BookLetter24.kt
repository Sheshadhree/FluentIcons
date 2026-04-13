package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookLetter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookLetter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 8.743f)
            lineToRelative(1.12f, 2.757f)
            horizontalLineToRelative(-2.24f)
            lineToRelative(1.12f, -2.757f)
            close()
            moveTo(4f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(14.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.12f, 19.38f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            close()
            moveTo(12.5f, 6f)
            curveToRelative(0.305f, 0f, 0.58f, 0.185f, 0.695f, 0.468f)
            lineToRelative(3.25f, 8f)
            curveToRelative(0.156f, 0.383f, -0.029f, 0.82f, -0.413f, 0.977f)
            curveToRelative(-0.383f, 0.156f, -0.82f, -0.029f, -0.977f, -0.413f)
            lineTo(14.23f, 13f)
            horizontalLineToRelative(-3.46f)
            lineToRelative(-0.825f, 2.032f)
            curveToRelative(-0.156f, 0.384f, -0.594f, 0.569f, -0.977f, 0.413f)
            curveToRelative(-0.384f, -0.156f, -0.569f, -0.594f, -0.413f, -0.977f)
            lineToRelative(3.25f, -8f)
            curveTo(11.92f, 6.185f, 12.195f, 6f, 12.5f, 6f)
            close()
        }
    }.build()
}
