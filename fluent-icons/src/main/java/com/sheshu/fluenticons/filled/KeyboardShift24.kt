package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShift24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShift24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.677f, 2.603f)
            curveToRelative(0.698f, -0.804f, 1.946f, -0.804f, 2.644f, 0f)
            lineToRelative(8.246f, 9.504f)
            curveToRelative(0.983f, 1.133f, 0.178f, 2.897f, -1.322f, 2.897f)
            horizontalLineTo(17f)
            verticalLineToRelative(5.247f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(7.783f, 22f, 7f, 21.217f, 7f, 20.25f)
            verticalLineToRelative(-5.247f)
            horizontalLineTo(3.754f)
            curveToRelative(-1.5f, 0f, -2.305f, -1.764f, -1.322f, -2.897f)
            lineToRelative(8.245f, -9.504f)
            close()
        }
    }.build()
}
