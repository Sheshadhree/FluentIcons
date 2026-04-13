package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextColorAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColorAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 11.167f)
            curveToRelative(0f, -0.368f, 0.246f, -0.667f, 0.55f, -0.667f)
            horizontalLineToRelative(9.9f)
            curveToRelative(0.304f, 0f, 0.55f, 0.299f, 0.55f, 0.667f)
            verticalLineToRelative(2.666f)
            curveToRelative(0f, 0.368f, -0.246f, 0.667f, -0.55f, 0.667f)
            horizontalLineToRelative(-9.9f)
            curveToRelative(-0.304f, 0f, -0.55f, -0.299f, -0.55f, -0.667f)
            verticalLineToRelative(-2.666f)
            close()
        }
    }.build()
}
