package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Oval48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Oval48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 24f)
            curveToRelative(0f, -8.284f, 6.716f, -15f, 15f, -15f)
            horizontalLineToRelative(10f)
            curveToRelative(8.284f, 0f, 15f, 6.716f, 15f, 15f)
            curveToRelative(0f, 8.284f, -6.716f, 15f, -15f, 15f)
            horizontalLineTo(19f)
            curveToRelative(-8.284f, 0f, -15f, -6.716f, -15f, -15f)
            close()
        }
    }.build()
}
