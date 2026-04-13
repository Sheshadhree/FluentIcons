package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackBelow28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackBelow28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 23.5f)
            curveTo(3.336f, 23.5f, 3f, 23.836f, 3f, 24.25f)
            reflectiveCurveTo(3.336f, 25f, 3.75f, 25f)
            horizontalLineToRelative(20.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(3.75f)
            close()
            moveTo(25f, 11f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-6f)
            horizontalLineTo(25f)
            close()
            moveToRelative(0f, -4.25f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(-6.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(2.75f)
            curveTo(23.321f, 3f, 25f, 4.679f, 25f, 6.75f)
            close()
            moveTo(11f, 3f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-6f)
            verticalLineTo(3f)
            close()
            moveTo(6.75f, 3f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(6.5f)
            horizontalLineTo(3f)
            verticalLineTo(6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            close()
            moveTo(4f, 17f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(4f)
            close()
            moveToRelative(13f, -6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            close()
        }
    }.build()
}
