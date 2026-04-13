package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.78f, 1.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(3.56f, 9.5f)
            horizontalLineToRelative(3.69f)
            curveTo(7.664f, 9.5f, 8f, 9.836f, 8f, 10.25f)
            reflectiveCurveTo(7.664f, 11f, 7.25f, 11f)
            horizontalLineToRelative(-5.5f)
            curveTo(1.336f, 11f, 1f, 10.664f, 1f, 10.25f)
            verticalLineToRelative(-5.5f)
            curveTo(1f, 4.336f, 1.336f, 4f, 1.75f, 4f)
            reflectiveCurveTo(2.5f, 4.336f, 2.5f, 4.75f)
            verticalLineToRelative(3.69f)
            lineToRelative(7.22f, -7.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
        }
    }.build()
}
