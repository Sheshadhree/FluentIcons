package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 13.25f)
            curveTo(9f, 13.664f, 8.664f, 14f, 8.25f, 14f)
            horizontalLineToRelative(-5.5f)
            curveTo(2.336f, 14f, 2f, 13.664f, 2f, 13.25f)
            verticalLineToRelative(-5.5f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            reflectiveCurveTo(3.5f, 7.336f, 3.5f, 7.75f)
            verticalLineToRelative(3.69f)
            lineToRelative(9.22f, -9.22f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(4.56f, 12.5f)
            horizontalLineToRelative(3.69f)
            curveTo(8.664f, 12.5f, 9f, 12.836f, 9f, 13.25f)
            close()
        }
    }.build()
}
