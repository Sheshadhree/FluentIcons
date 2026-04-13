package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ColorFillAccent28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ColorFillAccent28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.512f, 17.75f)
            curveTo(16.504f, 17.832f, 16.5f, 17.916f, 16.5f, 18f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            curveToRelative(1.785f, 0f, 3.257f, -1.335f, 3.473f, -3.062f)
            curveToRelative(0.479f, 0.456f, 0.777f, 1.1f, 0.777f, 1.812f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.011f)
            lineToRelative(1.102f, 1.102f)
            curveToRelative(1.464f, 1.464f, 3.838f, 1.464f, 5.303f, 0f)
            lineToRelative(1.101f, -1.102f)
            horizontalLineToRelative(1.745f)
            close()
        }
    }.build()
}
