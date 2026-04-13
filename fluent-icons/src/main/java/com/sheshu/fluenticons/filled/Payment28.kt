package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Payment28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.754f, 5f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(26f)
            verticalLineTo(8.75f)
            curveTo(26f, 6.679f, 24.32f, 5f, 22.25f, 5f)
            horizontalLineTo(5.753f)
            close()
            moveToRelative(-3.75f, 14.25f)
            verticalLineTo(11f)
            horizontalLineTo(26f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 2.071f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.753f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            close()
            moveTo(18.25f, 16.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(17.836f, 18f, 18.25f, 18f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
