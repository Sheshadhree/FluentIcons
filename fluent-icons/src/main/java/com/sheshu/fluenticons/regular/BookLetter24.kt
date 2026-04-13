package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookLetter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookLetter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 6f)
            curveToRelative(-0.305f, 0f, -0.58f, 0.185f, -0.695f, 0.468f)
            lineToRelative(-3.25f, 8f)
            curveToRelative(-0.156f, 0.383f, 0.029f, 0.82f, 0.413f, 0.977f)
            curveToRelative(0.383f, 0.156f, 0.821f, -0.029f, 0.977f, -0.413f)
            lineTo(10.77f, 13f)
            horizontalLineToRelative(3.46f)
            lineToRelative(0.825f, 2.032f)
            curveToRelative(0.156f, 0.384f, 0.594f, 0.569f, 0.977f, 0.413f)
            curveToRelative(0.384f, -0.156f, 0.569f, -0.594f, 0.413f, -0.977f)
            lineToRelative(-3.25f, -8f)
            curveTo(13.08f, 6.185f, 12.805f, 6f, 12.5f, 6f)
            close()
            moveToRelative(-1.12f, 5.5f)
            lineToRelative(1.12f, -2.757f)
            lineToRelative(1.12f, 2.757f)
            horizontalLineToRelative(-2.24f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(5.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 22f, 4f, 20.88f, 4f, 19.5f)
            verticalLineToRelative(-15f)
            close()
            moveTo(5.5f, 18f)
            horizontalLineTo(19f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineTo(18f)
            close()
        }
    }.build()
}
