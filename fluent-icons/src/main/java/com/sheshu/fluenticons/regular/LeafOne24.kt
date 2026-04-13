package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LeafOne24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LeafOne24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.238f, 3.272f)
            curveToRelative(-0.684f, -0.683f, -1.792f, -0.683f, -2.475f, 0f)
            lineTo(7.05f, 6.984f)
            curveToRelative(-2.733f, 2.733f, -2.733f, 7.164f, 0f, 9.897f)
            curveToRelative(1.176f, 1.176f, 2.665f, 1.846f, 4.199f, 2.01f)
            verticalLineToRelative(2.359f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-2.36f)
            curveToRelative(1.534f, -0.164f, 3.023f, -0.834f, 4.199f, -2.01f)
            curveToRelative(2.733f, -2.733f, 2.733f, -7.164f, 0f, -9.897f)
            lineToRelative(-3.712f, -3.712f)
            close()
            moveTo(12.75f, 17.38f)
            verticalLineToRelative(-5.63f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.335f, -0.75f, 0.75f)
            verticalLineToRelative(5.63f)
            curveToRelative(-1.148f, -0.157f, -2.256f, -0.677f, -3.138f, -1.56f)
            curveToRelative(-2.147f, -2.147f, -2.147f, -5.628f, 0f, -7.776f)
            lineToRelative(3.711f, -3.711f)
            curveToRelative(0.098f, -0.098f, 0.256f, -0.098f, 0.354f, 0f)
            lineToRelative(3.711f, 3.711f)
            curveToRelative(2.147f, 2.148f, 2.147f, 5.63f, 0f, 7.777f)
            curveToRelative(-0.882f, 0.882f, -1.99f, 1.402f, -3.138f, 1.56f)
            close()
        }
    }.build()
}
