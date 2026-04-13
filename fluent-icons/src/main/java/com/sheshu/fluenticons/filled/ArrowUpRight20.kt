package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3.75f)
            curveTo(8f, 3.336f, 8.334f, 3f, 8.75f, 3f)
            horizontalLineToRelative(7.5f)
            curveTo(16.664f, 3f, 17f, 3.336f, 17f, 3.75f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.335f, -0.75f, -0.75f)
            verticalLineTo(5.56f)
            lineTo(4.28f, 16.78f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            lineTo(14.44f, 4.5f)
            horizontalLineTo(8.75f)
            curveTo(8.334f, 4.5f, 8f, 4.164f, 8f, 3.75f)
            close()
        }
    }.build()
}
