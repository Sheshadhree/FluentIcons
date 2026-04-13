package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookExclamationMark24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookExclamationMark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 20.88f, 5.12f, 22f, 6.5f, 22f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            horizontalLineToRelative(14.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.5f)
            curveTo(20.5f, 3.12f, 19.38f, 2f, 18f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            close()
            moveToRelative(7.5f, 7.25f)
            verticalLineToRelative(-5f)
            curveTo(11.5f, 6.336f, 11.836f, 6f, 12.25f, 6f)
            reflectiveCurveTo(13f, 6.336f, 13f, 6.75f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            close()
            moveToRelative(1.75f, 2.75f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
