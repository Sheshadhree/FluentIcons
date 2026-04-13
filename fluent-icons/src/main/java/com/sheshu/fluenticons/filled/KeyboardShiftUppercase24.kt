package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShiftUppercase24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShiftUppercase24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.32f, 2.603f)
            curveToRelative(-0.697f, -0.804f, -1.945f, -0.804f, -2.643f, 0f)
            lineToRelative(-8.245f, 9.504f)
            curveToRelative(-0.984f, 1.133f, -0.179f, 2.897f, 1.321f, 2.897f)
            horizontalLineTo(7f)
            verticalLineToRelative(2.247f)
            curveTo(7f, 18.217f, 7.783f, 19f, 8.75f, 19f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.967f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-2.247f)
            horizontalLineToRelative(3.245f)
            curveToRelative(1.5f, 0f, 2.305f, -1.764f, 1.322f, -2.897f)
            lineToRelative(-8.245f, -9.504f)
            close()
            moveTo(7.75f, 20.5f)
            curveTo(7.336f, 20.5f, 7f, 20.836f, 7f, 21.25f)
            reflectiveCurveTo(7.336f, 22f, 7.75f, 22f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
