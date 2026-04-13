package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NextFrame24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NextFrame24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3.75f)
            curveTo(5.5f, 3.336f, 5.164f, 3f, 4.75f, 3f)
            reflectiveCurveTo(4f, 3.336f, 4f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(4f, 20.664f, 4.336f, 21f, 4.75f, 21f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveToRelative(6.24f, -0.44f)
            curveTo(10.577f, 2.513f, 9f, 3.344f, 9f, 4.752f)
            verticalLineToRelative(14.495f)
            curveToRelative(0f, 1.413f, 1.589f, 2.244f, 2.75f, 1.437f)
            lineToRelative(10.498f, -7.302f)
            curveToRelative(1.005f, -0.7f, 1f, -2.188f, -0.01f, -2.88f)
            lineTo(11.739f, 3.309f)
            close()
        }
    }.build()
}
