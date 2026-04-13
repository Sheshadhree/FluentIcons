package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 12.998f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(22.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
            moveTo(21.25f, 2f)
            curveTo(22.769f, 2f, 24f, 3.232f, 24f, 4.75f)
            verticalLineToRelative(7.248f)
            horizontalLineTo(4f)
            verticalLineTo(4.75f)
            curveTo(4f, 3.23f, 5.23f, 2f, 6.75f, 2f)
            horizontalLineToRelative(14.5f)
            close()
            moveTo(4f, 22.75f)
            verticalLineToRelative(-7.252f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(7.252f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(6.75f)
            curveTo(5.23f, 25.5f, 4f, 24.269f, 4f, 22.75f)
            close()
        }
    }.build()
}
