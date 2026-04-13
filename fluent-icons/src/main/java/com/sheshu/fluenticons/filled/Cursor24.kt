package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cursor24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cursor24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.921f, 2.3f)
            curveTo(6.936f, 1.532f, 5.5f, 2.234f, 5.5f, 3.482f)
            verticalLineToRelative(17.009f)
            curveToRelative(0f, 1.422f, 1.795f, 2.046f, 2.677f, 0.93f)
            lineToRelative(4.19f, -5.3f)
            curveToRelative(0.314f, -0.396f, 0.79f, -0.626f, 1.295f, -0.626f)
            horizontalLineToRelative(6.852f)
            curveToRelative(1.428f, 0f, 2.049f, -1.808f, 0.921f, -2.684f)
            lineTo(7.921f, 2.299f)
            close()
        }
    }.build()
}
