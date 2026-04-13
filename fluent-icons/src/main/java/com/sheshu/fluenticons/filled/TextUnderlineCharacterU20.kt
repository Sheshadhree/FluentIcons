package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextUnderlineCharacterU20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderlineCharacterU20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3.75f)
            curveTo(7f, 3.336f, 6.664f, 3f, 6.25f, 3f)
            reflectiveCurveTo(5.5f, 3.336f, 5.5f, 3.75f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(3.75f)
            curveTo(14.5f, 3.336f, 14.164f, 3f, 13.75f, 3f)
            reflectiveCurveTo(13f, 3.336f, 13f, 3.75f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineTo(3.75f)
            close()
            moveTo(5.75f, 15.5f)
            curveTo(5.336f, 15.5f, 5f, 15.836f, 5f, 16.25f)
            reflectiveCurveTo(5.336f, 17f, 5.75f, 17f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-8.5f)
            close()
        }
    }.build()
}
