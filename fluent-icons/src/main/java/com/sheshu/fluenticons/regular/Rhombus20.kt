package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rhombus20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rhombus20",
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
            moveTo(6.76f, 4f)
            curveTo(6.344f, 4f, 5.97f, 4.258f, 5.824f, 4.648f)
            lineToRelative(-3.76f, 10f)
            curveTo(1.82f, 15.302f, 2.303f, 16f, 3.001f, 16f)
            horizontalLineToRelative(10.237f)
            curveToRelative(0.417f, 0f, 0.79f, -0.258f, 0.936f, -0.648f)
            lineToRelative(3.76f, -10f)
            curveTo(18.18f, 4.698f, 17.697f, 4f, 16.998f, 4f)
            horizontalLineTo(6.761f)
            close()
        }
    }.build()
}
