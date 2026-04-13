package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProjectionScreen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProjectionScreen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            curveToRelative(0f, 0.653f, 0.417f, 1.209f, 1f, 1.415f)
            verticalLineToRelative(7.335f)
            curveTo(3f, 15.321f, 4.679f, 17f, 6.75f, 17f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-3.5f)
            curveTo(7.336f, 19.5f, 7f, 19.836f, 7f, 20.25f)
            reflectiveCurveTo(7.336f, 21f, 7.75f, 21f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(4.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(5.915f)
            curveToRelative(0.583f, -0.206f, 1f, -0.762f, 1f, -1.415f)
            curveTo(22f, 3.672f, 21.328f, 3f, 20.5f, 3f)
            horizontalLineToRelative(-17f)
            close()
        }
    }.build()
}
