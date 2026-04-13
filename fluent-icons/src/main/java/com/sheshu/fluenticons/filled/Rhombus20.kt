package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.89f, 4.296f)
            curveTo(5.182f, 3.516f, 5.927f, 3f, 6.76f, 3f)
            horizontalLineToRelative(10.237f)
            curveToRelative(1.397f, 0f, 2.364f, 1.396f, 1.872f, 2.704f)
            lineToRelative(-3.76f, 10f)
            curveTo(14.817f, 16.484f, 14.071f, 17f, 13.238f, 17f)
            horizontalLineTo(3.001f)
            curveToRelative(-1.397f, 0f, -2.363f, -1.396f, -1.872f, -2.704f)
            lineToRelative(3.76f, -10f)
            close()
        }
    }.build()
}
