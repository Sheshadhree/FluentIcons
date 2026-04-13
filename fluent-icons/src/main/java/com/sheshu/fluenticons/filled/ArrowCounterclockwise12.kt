package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 2f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(3f, 1.586f, 3f, 2f)
            verticalLineToRelative(0.646f)
            curveTo(3.796f, 1.933f, 4.848f, 1.5f, 6f, 1.5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveTo(8.485f, 10.5f, 6f, 10.5f)
            curveToRelative(-2.194f, 0f, -4.021f, -1.57f, -4.42f, -3.648f)
            curveTo(1.492f, 6.387f, 1.885f, 6f, 2.358f, 6f)
            curveToRelative(0.355f, 0f, 0.636f, 0.291f, 0.711f, 0.638f)
            curveTo(3.36f, 7.988f, 4.562f, 9f, 6f, 9f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveTo(7.657f, 3f, 6f, 3f)
            curveTo(5.383f, 3f, 4.81f, 3.186f, 4.334f, 3.505f)
            horizontalLineTo(4.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(2f)
            close()
        }
    }.build()
}
