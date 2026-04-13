package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.78f, 2.28f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(5.44f, 5.5f)
            lineTo(5f, 7f)
            lineToRelative(1.5f, -0.44f)
            lineToRelative(4.28f, -4.28f)
            close()
            moveTo(6.25f, 1.5f)
            curveTo(6.664f, 1.5f, 7f, 1.836f, 7f, 2.25f)
            reflectiveCurveTo(6.664f, 3f, 6.25f, 3f)
            horizontalLineToRelative(-2.5f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(4.5f)
            curveTo(3f, 8.664f, 3.336f, 9f, 3.75f, 9f)
            horizontalLineToRelative(4.5f)
            curveTo(8.664f, 9f, 9f, 8.664f, 9f, 8.25f)
            verticalLineToRelative(-2.5f)
            curveTo(9f, 5.336f, 9.336f, 5f, 9.75f, 5f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(2.5f)
            close()
        }
    }.build()
}
