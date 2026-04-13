package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Database16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Database16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 3.5f)
            curveTo(13f, 4.88f, 10.761f, 6f, 8f, 6f)
            reflectiveCurveTo(3f, 4.88f, 3f, 3.5f)
            reflectiveCurveTo(5.239f, 1f, 8f, 1f)
            reflectiveCurveToRelative(5f, 1.12f, 5f, 2.5f)
            close()
            moveToRelative(-10f, 9f)
            verticalLineTo(5.487f)
            curveTo(4.057f, 6.413f, 5.864f, 7f, 8f, 7f)
            reflectiveCurveToRelative(3.943f, -0.587f, 5f, -1.513f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.425f, -2.149f, 2.5f, -5f, 2.5f)
            reflectiveCurveToRelative(-5f, -1.075f, -5f, -2.5f)
            close()
        }
    }.build()
}
