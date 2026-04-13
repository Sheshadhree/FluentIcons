package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackRight28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 24.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(25f, 24.664f, 25f, 24.25f)
            verticalLineTo(3.75f)
            curveTo(25f, 3.336f, 24.664f, 3f, 24.25f, 3f)
            reflectiveCurveTo(23.5f, 3.336f, 23.5f, 3.75f)
            verticalLineToRelative(20.5f)
            close()
            moveTo(11f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5.5f)
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
            moveTo(3f, 17f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, 4.25f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(6.5f)
            verticalLineTo(25f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            close()
            moveTo(17f, 24f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(6f)
            verticalLineTo(24f)
            close()
            moveToRelative(-6f, -13f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            close()
        }
    }.build()
}
