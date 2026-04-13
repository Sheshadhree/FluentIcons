package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mail32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mail32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.004f, 9.303f)
            curveTo(2.107f, 6.909f, 4.081f, 5f, 6.5f, 5f)
            horizontalLineToRelative(19f)
            curveToRelative(2.42f, 0f, 4.393f, 1.909f, 4.496f, 4.303f)
            lineToRelative(-1.476f, 0.82f)
            lineTo(16f, 16.864f)
            lineTo(3.48f, 10.123f)
            lineToRelative(-1.476f, -0.82f)
            close()
            moveTo(2f, 11.588f)
            verticalLineTo(22.5f)
            curveTo(2f, 24.985f, 4.015f, 27f, 6.5f, 27f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(11.588f)
            lineToRelative(-0.526f, 0.293f)
            lineToRelative(-13f, 7f)
            curveToRelative(-0.296f, 0.159f, -0.652f, 0.159f, -0.948f, 0f)
            lineTo(2.514f, 11.874f)
            lineTo(2f, 11.588f)
            close()
        }
    }.build()
}
