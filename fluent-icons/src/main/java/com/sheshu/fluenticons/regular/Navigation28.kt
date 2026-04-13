package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Navigation28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Navigation28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.75f)
            curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
            horizontalLineToRelative(22.5f)
            curveTo(25.664f, 5f, 26f, 5.336f, 26f, 5.75f)
            reflectiveCurveTo(25.664f, 6.5f, 25.25f, 6.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
            close()
            moveToRelative(0f, 16f)
            curveTo(2f, 21.336f, 2.336f, 21f, 2.75f, 21f)
            horizontalLineToRelative(22.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 22.5f, 2f, 22.164f, 2f, 21.75f)
            close()
            moveTo(2.75f, 13f)
            curveTo(2.336f, 13f, 2f, 13.336f, 2f, 13.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(22.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(25.664f, 13f, 25.25f, 13f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
