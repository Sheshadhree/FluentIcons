package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRight12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRight12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.22f, 10.78f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(8.44f, 2.5f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 2.5f, 4f, 2.164f, 4f, 1.75f)
            reflectiveCurveTo(4.336f, 1f, 4.75f, 1f)
            horizontalLineToRelative(5.5f)
            curveTo(10.664f, 1f, 11f, 1.336f, 11f, 1.75f)
            verticalLineToRelative(5.5f)
            curveTo(11f, 7.664f, 10.664f, 8f, 10.25f, 8f)
            reflectiveCurveTo(9.5f, 7.664f, 9.5f, 7.25f)
            verticalLineTo(3.56f)
            lineToRelative(-7.22f, 7.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            close()
        }
    }.build()
}
