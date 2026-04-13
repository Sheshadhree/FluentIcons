package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.List28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.List28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 6.336f, 3.336f, 6f, 3.75f, 6f)
            horizontalLineToRelative(18.5f)
            curveTo(22.664f, 6f, 23f, 6.336f, 23f, 6.75f)
            reflectiveCurveTo(22.664f, 7.5f, 22.25f, 7.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 7.5f, 3f, 7.164f, 3f, 6.75f)
            close()
            moveToRelative(0f, 14f)
            curveTo(3f, 20.336f, 3.336f, 20f, 3.75f, 20f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 21.5f, 3f, 21.164f, 3f, 20.75f)
            close()
            moveTo(3.75f, 13f)
            curveTo(3.336f, 13f, 3f, 13.336f, 3f, 13.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(20.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(24.664f, 13f, 24.25f, 13f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
